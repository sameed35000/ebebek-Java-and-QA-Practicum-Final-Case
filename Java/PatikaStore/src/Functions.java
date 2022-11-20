import java.util.ArrayList;
import java.util.Scanner;


public class Functions<E> {

    public void printNotebookList(ArrayList<Notebook> list){
        
    	System.out.println("Notebook Listesi");
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   |");
        System.out.println("---------------------------------------------------------------------");
        for (Notebook i:list) {
        	int discount = i.getPrice()*15/100;
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
            i.getPrintID(),i.getName(),i.getPrice()-discount,i.getBrandName(),i.getStock(),i.getDiscount(),i.getRAM(),i.getScreen(),i.getSSD());
        }
    }
    public void printPhoneList(ArrayList<Phone> list2){
        System.out.println("Cep Telefonu Listesi");
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   | Pil Kapasitesi  | Renk           | Kamera    |");
        System.out.println("---------------------------------------------------------------------");
        for (Phone i:list2) {
        	int discount = i.getPrice()*15/100;
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | %-9s | \n",
                    i.getPrintID(),i.getName(),i.getPrice()-discount,i.getBrandName(),i.getStock(),i.getDiscount(),i.getRAM(),i.getScreen(),i.getSSD(),i.getBatteryPower(),i.getColor(),i.getColor());
        }
    }
    public void deleteProduct(ArrayList<E> e){
        Scanner input=new Scanner(System.in);
        int deleteSelect=input.nextInt();
        e.remove(deleteSelect-1);
        System.out.println(deleteSelect+".Ürün Silindi");
    }
    public void notebookFilterList(ArrayList<Notebook> list){
        Scanner input=new Scanner(System.in);
        ArrayList<Notebook> temporaryList=new ArrayList<>();
        System.out.println("Filtrelemek istediğiniz özelliği seçiniz");
        System.out.println("1-ID");
        System.out.println("2-Marka");
        int selectFilter= input.nextInt();
        switch (selectFilter){
            case 1:
                System.out.println("Listelemek istediğiniz ID giriniz.");
                int selectID=input.nextInt();
                temporaryList.add(list.get(selectID-1));
                printNotebookList(temporaryList);
                break;
            case 2:
                System.out.println("Listelemek istediğiniz marka adını doğru giriniz.");
                String selectBrand= input.next();
                for (Notebook i:list) {
                    if (i.getBrandName().equals(selectBrand)){
                        temporaryList.add(i);
                    }
                    else {
                        System.out.println("Bu markada ürün bulunamadı");
                    }
                    if (!temporaryList.isEmpty()){
                    printNotebookList(temporaryList);
                    }
                }
                break;
        }
    }
    public void phoneFilterList(ArrayList<Phone> list){
        Scanner input=new Scanner(System.in);
        ArrayList<Phone> temporaryList=new ArrayList<>();
        System.out.println("Filtrelemek istediğiniz özelliği seçiniz");
        System.out.println("1-ID");
        System.out.println("2-Marka");
        int selectFilter= input.nextInt();
        switch (selectFilter){
            case 1:
                System.out.println("Listelemek istediğiniz ID giriniz.");
                int selectID=input.nextInt();
                temporaryList.add(list.get(selectID-1));
                printPhoneList(temporaryList);
                break;
            case 2:
                System.out.println("Listelemek istediğiniz marka adını doğru giriniz.");
                String selectBrand= input.next();
                for (Phone i:list) {
                    if (i.getBrandName().equals(selectBrand)){
                        temporaryList.add(i);
                    }else {
                        System.out.println("Bu markada ürün bulunamadı");
                    }
                    if (!temporaryList.isEmpty()){
                    printPhoneList(temporaryList);
                    }
                }
                break;
        }
    }
}
