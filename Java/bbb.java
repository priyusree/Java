import java.util.*;
public class bbb {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter income:");
        double income=sn.nextDouble();
        sn.nextLine();
        Map<String,Double>map=new HashMap<>();
        double totalexpenses=0;

        while(true){
        
        System.out.println("Enter expense and type or done:");
        String expensetype=sn.nextLine().trim();
        if(expensetype.equals("done")){
            break;
        }
        System.out.println("Enter price of expense:");
        double price=sn.nextDouble();
        sn.nextLine();
        
            map.put(expensetype,map.getOrDefault(expensetype,0.0)+price);
            totalexpenses+=price;
        }
          

        
        double savings=income-totalexpenses;
        System.out.println("Summary of expenses");
        System.out.println("Total income:"+income+"$");
        System.out.println("Total expense:"+totalexpenses+"$");
        System.out.println("Total savings:"+savings+"$");
        System.err.println("Analysis");
        System.out.println("Expense and price");
        for(Map.Entry<String,Double>entry:map.entrySet()){
            System.out.println("-"+entry.getKey()+":"+entry.getValue());
        }


         sn.close();



    }
}
