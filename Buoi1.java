/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi1;

import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Buoi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //bai1
        //currentTime();     
       // bai2();      
       //bai3();
       //bai4();
       //bai5();
       //bai6();
       //bai7();
       //bai8();
       //bai9();
       test();
    }
    //Bai 1
    public static void currentTime(){
        //khai báo đối tượng current thuộc class LocalDateTime
    LocalDateTime current = LocalDateTime.now();
    //sử dụng class DateTimeFormatter để định dạng ngày giờ theo kiểu pattern
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    //sử dụng phương thức format() để định dạng ngày giờ hiện tại rồi gán cho chuỗi formatted
    String formatted = current.format(formatter);
    //hiển thị chuỗi formatted ra màn hình
    System.out.println("\n\n NGAY GIO HIEN TAI: " + formatted);
    }
    //Bai 2
    public  static void bai2(){
        System.out.println("Multication Table");
        //Display the number title
        System.out.println("  ");
        for (int j=1;j<=9;j++)
        {
            System.out.print(" "+j);
            System.out.println("\n---------------------------------------------");
            for (int i=1;i<=9;i++)
            {
                System.out.print(i+"|");
                for (j=1;j<=9;j++){
                    System.out.printf("%4d",i*j);
                }
                System.out.println();
            }
        }
    }
    //bai3
    public static  void bai3()
    {
        System.out.println("****");
        System.out.println("****");
        // Lặp qua từng dòng
        for (int i = 2; i <= 4; i++) {
            // In các số từ i đến 2 theo thứ tự giảm dần
            for (int j = i; j >= 2; j--) {
                System.out.print(j + " ");
            }
            // In dấu *
            for (int k = 1; k <= 4; k++) {
                System.out.print("*");
            }
            System.out.println(); // Xuống dòng sau khi in xong một dòng
        }
    }
    //bai4
    public static void bai4(){
        int ucln=0;
                System.out.println("Nhap n1: ");
                Scanner input1 = new Scanner(System.in);             
                int n1 = input1.nextInt();
                System.out.println("Nhap n2: ");
                Scanner input2 = new Scanner (System.in);
                int n2 = input2.nextInt();                
                for( int i =1; i<=n1 && i<=n2; i++){
                    if(n1%i==0 && n2%i==0){
                       ucln = i;
                    }
                }
                System.out.print("K lon nhat ma n1 va n2 deu chia het: " + ucln);  
    }
    //bai5
    public static void bai5()
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int numberofLines=input.nextInt();
        for (int rows=1;rows<=numberofLines;rows++)
        {
            for (int s=numberofLines-rows;s>=1;s--)
            {
                System.out.print("  ");
            }
            for(int l=rows;l>=2;l--)
            {
                System.out.print(l+" ");
            }
            for (int r=1;r<=rows;r++)
            {
                System.out.print(r+" ");
            }
            System.out.println();
        }

    }
    //bai6
    public static void bai6() {
        double hocPhiBanDau = 10000; // Học phí ban đầu
        double tangHocPhiHN = 0.05; // Tỷ lệ tăng học phí hàng năm

        // Hiển thị học phí trong 10 năm
        System.out.println("Học phí trong 10 năm:");
        for (int year = 1; year <= 10; year++) {
            // Tăng học phí theo tỷ lệ hàng năm
            hocPhiBanDau += hocPhiBanDau * tangHocPhiHN; 
            System.out.printf("Năm %d: $%.2f\n", year, hocPhiBanDau);
        }
        // Tính tổng chi phí học phí của bốn năm bắt đầu sau năm thứ mười
        double totalCost = 0;
        for (int year = 11; year <= 14; year++) {
            // Tăng học phí theo tỷ lệ hàng năm
            hocPhiBanDau += hocPhiBanDau * tangHocPhiHN; 
            totalCost += hocPhiBanDau;
        }
        System.out.printf("Tổng chi phí học phí của bốn năm bắt đầu sau năm thứ mười: $%.2f\n", totalCost);
    }
    //bai7
    public static void bai7()
    {
        Scanner scanner = new Scanner(System.in);
        int numberStudent=0;
        while (numberStudent<1)
        {
            System.out.print("Nhập số lượng học sinh:");
            numberStudent=scanner.nextInt();
        }
        double highestScore=0;
        String studentNameHightest=" ";
        for (int i=1;i<=numberStudent;i++)
        {
            System.out.print("Nhập họ tên học sinh thứ "+i+":");
            String studentName=scanner.next();
            System.out.print("Nhập điểm của học sinh:");
            double score=scanner.nextDouble();
            if (score>highestScore) {
                highestScore = score;
                studentNameHightest = studentName;
            }
        }
        System.out.println("Học sinh đạt điểm cao nhất là:"+studentNameHightest);
        System.out.println("Với số điểm là:"+highestScore);
    }
    //Bai 8:
    public static void bai8()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Loan Amount:");
        double loanAmount=scanner.nextDouble();
        System.out.print("Number of Years:");
        int NumberofYears=scanner.nextInt();
        double interestRate=5.0;
        System.out.println("Interest Rate\tMonthly Payment\t\t\t TotalPayment");
        while (interestRate <= 8.0) {
            double monthlyInterestRate = interestRate/100/ 12;
            int loanTermInMonths = NumberofYears * 12;
            double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTermInMonths));
            double totalPayment = monthlyPayment * loanTermInMonths;
            System.out.printf("%.2f \t\t\t %.2f \t\t\t\t %.2f\n", interestRate, monthlyPayment, totalPayment);
            interestRate += 0.125;
        }
    }
    //Bai 9
    public static void bai9()
    {
        double baseSalary = 5000; // Lương cơ bản
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập mục tiêu muốn kiếm được:");
        double targetIncome=scanner.nextDouble();
        double commissionRate1 = 0.08; // Tỷ lệ hoa hồng cho 5.000 đô la đầu tiên
        double commissionRate2 = 0.10; // Tỷ lệ hoa hồng cho 5.000 đô la tiếp theo
        double commissionRate3 = 0.12; // Tỷ lệ hoa hồng cho số tiền vượt qua 10.000 đô la
        double numberOfSales = 0;
        double temp=(targetIncome-baseSalary*commissionRate1-baseSalary*commissionRate2)/commissionRate3;
        numberOfSales=temp+10000;
        System.out.println("Số lượng bán hàng tối thiểu cần tạo ra để kiếm được " + targetIncome + " đô la một năm là: " + numberOfSales);
    }
    public static void test(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap ngay trong tuan: ");
        int days=scanner.nextInt();
        switch (days){
            case 1:
                System.out.println("Thu 2");
                break;
            case 2:
                System.out.println(" thu 3");
                break;
            case 3:
                System.out.println("thu 4");
                break;
            case 4:
                System.out.println("thu 5");
                break;
            case 5: 
                System.out.println("thu 6");
                break;
            case 6:
                System.out.println("thu 7");
                break;
            case 7:
                System.out.println("chu nhat");
                break;
                default:
                    System.out.println("Khong co thu nay trong tuan");
        }
       }
}                



    
