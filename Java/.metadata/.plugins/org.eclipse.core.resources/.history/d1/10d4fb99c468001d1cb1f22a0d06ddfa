import java.util.*;

public class Main<E> {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ID = 0;
        Boolean stop = true;
        Functions f = new Functions();
        TreeSet<String> a = new TreeSet<>(new OrderByName());
        ArrayList<Notebook> n = new ArrayList<>();
        ArrayList<Phone> p = new ArrayList<>();
        TreeMap<Integer, Notebook> notebookMap = new TreeMap<>();
        a.add("Samsung");
        a.add("Lenovo");
        a.add("Apple");
        a.add("Huawei");
        a.add("Casper");
        a.add("Asus");
        a.add("HP");
        a.add("Xiaomi");
        a.add("Monster");
        while (stop) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1-Notebook İşlemleri");
            System.out.println("2-Cep Telefonu İşlemleri");
            System.out.println("3-Marka Listele");
            System.out.println("0-Çıkış Yap");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Notebook işlemlerine hoşgeldiniz.");
                    System.out.println("Yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-Ürünleri Listele");
                    System.out.println("2-Notebook Ekle");
                    System.out.println("3-Notebook sil");
                    System.out.println("4-Filtreli arama yap");
                    int selectOption = input.nextInt();
                    if (selectOption == 1) {
                        f.printNotebookList(n);
                    }
                    if (selectOption == 2) {
                        addNotebook(n);
                        notebookMap.put(ID, n.get(ID));
                    }
                    if (selectOption == 3) {
                        System.out.println("Notebook siliyorsunuz.");
                        System.out.println("Silmek istediğiniz notebook ID giriniz. ");
                        f.deleteProduct(n);
                    }
                    if (selectOption == 4) {
                        f.notebookFilterList(n);
                    }
                    break;
                case 2:
                    System.out.println("Cep Telefonu işlemlerine hoşgeldiniz.");
                    System.out.println("Yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-Ürünleri Listele");
                    System.out.println("2-Cep Telefonu Ekle");
                    System.out.println("3-Cep Telefonu sil");
                    System.out.println("4-Filtreli arama yap");
                    int selectOption2 = input.nextInt();
                    if (selectOption2 == 1) {
                        f.printPhoneList(p);
                    }
                    if (selectOption2 == 2) {
                        addPhone(p);
                    }
                    if (selectOption2 == 3) {
                        System.out.println("Cep Telefonu siliyorsunuz.");
                        System.out.println("Silmek istediğiniz Cep Telefonu ID giriniz. ");
                        f.deleteProduct(p);
                    }
                    if (selectOption2 == 4) {
                        f.phoneFilterList(p);
                    }
                    break;
                case 3:
                    System.out.println("-MARKALAR-");
                    for (String i : a) {
                        System.out.println(i);
                    }
                    break;
                case 0:
                    System.out.println("Çıkış Yapıldı.");
                    stop = false;
                    break;
                default:
                    System.out.println("Geçersiz değer girdiniz");
                    break;
            }
        }
    }

    public static void addNotebook(ArrayList<Notebook> n) {
        System.out.println("Notebook Ekliyorsunuz...");
        int selectPrice;
        int selectDiscount;
        int selectStock;
        String selectName;
        String selectBrandName;
        int selectRAM;
        int selectSSD;
        double selectScreen;
        Scanner input = new Scanner(System.in);
        System.out.print("Fiyatını giriniz:");
        selectPrice = input.nextInt();
        System.out.print("İndirim oranını giriniz:");
        selectDiscount = input.nextInt();
        System.out.println("Stok giriniz:");
        selectStock = input.nextInt();
        System.out.println("Ürün ismini giriniz:");
        input.nextLine();
        selectName = input.nextLine();
        System.out.println("Markasını giriniz:");
        selectBrandName = input.next();
        System.out.print("RAM giriniz:");
        selectRAM = input.nextInt();
        System.out.print("Depolama alanını giriniz:");
        selectSSD = input.nextInt();
        System.out.print("Ekran boyutunu giriniz:");
        selectScreen = input.nextDouble();
        n.add(new Notebook(selectPrice, selectDiscount, selectStock, selectName, selectBrandName, selectRAM, selectSSD, selectScreen));
    }

    public static void addPhone(ArrayList<Phone> p) {
        System.out.println("Telefon Ekliyorsunuz...");
        int selectPrice;
        int selectDiscount;
        int selectStock;
        String selectName;
        String selectBrandName;
        int selectRAM;
        int selectSSD;
        double selectScreen;
        int selectBatteryPower;
        int selectCamera;
        String selectColor;
        Scanner input = new Scanner(System.in);
        System.out.print("Fiyatını giriniz : ");
        selectPrice = input.nextInt();
        System.out.print("İndirim oranını giriniz : ");
        selectDiscount = input.nextInt();
        System.out.println("Stok giriniz : ");
        selectStock = input.nextInt();
        System.out.println("Ürün ismini giriniz : ");
        selectName = input.nextLine();
        System.out.println("Markasını giriniz : ");
        selectBrandName = input.next();
        System.out.print("RAM giriniz : ");
        selectRAM = input.nextInt();
        System.out.print("Depolama alanını giriniz : ");
        selectSSD = input.nextInt();
        System.out.print("Ekran boyutunu giriniz : ");
        selectScreen = input.nextDouble();
        System.out.println("Pil gücünü giriniz : ");
        selectBatteryPower = input.nextInt();
        System.out.println("Rengini giriniz : ");
        selectColor = input.next();
        System.out.println("Kamerayı giriniz : ");
        selectCamera = input.nextInt();
        p.add(new Phone(selectPrice, selectDiscount, selectStock, selectName, selectBrandName, selectRAM, selectSSD, selectScreen, selectBatteryPower, selectColor, selectCamera));
    }
}
