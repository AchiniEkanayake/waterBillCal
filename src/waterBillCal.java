import java.util.Scanner;

class waterBillMethods {

    double unitPrice;

    void inputData() {

        //input unit price for the one time
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        unitPrice = sc.nextDouble();

        //Get bill number and unit price
        for (int i = 1; i <= 2; i++) {
            System.out.print( '\n' +"Enter bill " + i + " number: ");
            int billNumber = sc.nextInt();
            System.out.print("Enter bill " + billNumber + " used units: " );
            int usedUnits = sc.nextInt();
            calculateBill(billNumber,usedUnits,unitPrice);
        }
    }

    //
    private static void calculateBill(int billNumber,int usedUnits,double unitPrice){

        //cal discount
            double discount = 0;
            if (usedUnits >= 200) {
                discount = 0.06;
            } else if (usedUnits >= 100 && usedUnits < 199) {
                discount = 0.02;
            }
            double totalAmount = (usedUnits * unitPrice) * (1 - discount);

            //print billNumber and Total amount
            System.out.print("Bill Number = "+ billNumber + " Total amount = " + totalAmount);

    }

}

public class waterBillCal {
    public static void main(String[] args) {
        waterBillMethods a = new waterBillMethods();
        a.inputData();
    }
}


