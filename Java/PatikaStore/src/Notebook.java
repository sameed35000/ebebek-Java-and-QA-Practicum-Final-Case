public class Notebook extends Product{
    private static Integer notebookID=1;
    private int printID=0;
    public Notebook(Integer price, Integer discount, Integer stock, String name, String brandName, Integer RAM, Integer SSD, Double screen) {
        super(price, discount, stock, name, brandName, RAM, SSD, screen);
        this.setPrintID(getNotebookID());
        notebookID++;
    }

    public static Integer getNotebookID() {
        return notebookID;
    }

    public static void setNotebookID(Integer notebookID) {
        Notebook.notebookID = notebookID;
    }

    public int getPrintID() {
        return printID;
    }

    public void setPrintID(int printID) {
        this.printID = printID;
    }
}
