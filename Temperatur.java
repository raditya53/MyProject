import java.util.*;

/**
 *
 * @author ASUS
 */
public class Temperatur {
static String ulang;
public Double Cel(double input, int convert){
    double hasil = 0;
    if (convert == 1){
        hasil = 1.8 * input + 32;
    } else if(convert ==2){
        hasil = (4 * input)/5;
    } else if (convert == 3) {
        hasil = input + 273;
    }
    return hasil;
}
public Double Fah(double input, int convert){
    double hasil = 0;
    if (convert == 1){
        hasil = (5 * (input - 32))/9;
    } else if (convert == 2) {
        hasil = (4 * (input - 32))/9;
    } else if (convert == 3){
        hasil = (5 * (input-32))/9 + 273;
    }
    return hasil;
}
public Double Rem(double input, int convert){
    double hasil = 0;
    if (convert == 1){
        hasil = (5 * input)/4;
    } else if (convert == 2) {
        hasil = (9 * input)/4 + 32;
    } else if (convert == 3){
        hasil = (5 * input)/4 + 273;
    }
    return hasil;
}
public Double Kel(double input, int convert){
    double hasil = 0;
    if (convert == 1){
        hasil = input - 273;
    } else if (convert ==2){
        hasil = (9* (input-273))/5 + 32;
    } else if (convert == 3){
        hasil = (4*(input - 273))/5;
    }
    return hasil;
}

    public static void main(String[] args) {
        try{
        do{
        Scanner input = new Scanner(System.in);
        double hasil,suhu;
        int convert;
        Temperatur obj = new Temperatur();
        System.out.println("Selamat Datang di perhitungan Temperatur");
        System.out.println("Pilihan yang dipilih akan di convert ke jenis yang berbeda");
        System.out.println("pilihan yang tersedia");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Reamur");
        System.out.println("4. Kelvin");
        System.out.println("5. exit");
        System.out.print("Masukkan pilihan anda ");
        int pil = input.nextInt();
            System.out.println("");
        switch (pil){
            case 1:
                System.out.println("Anda memilih Celcius");
                System.out.print("Masukkan suhu ");
                suhu = input.nextDouble();
                System.out.println("ingin di konversikan kemana");
                System.out.println("1. Fahrenheit");
                System.out.println("2. Reamur");
                System.out.println("3. Kelvin");
                System.out.print("pilihan anda ");
                convert = input.nextInt();
                hasil = obj.Cel(suhu, convert);
                System.out.println("hasil convert dari pilihan anda adalah " + hasil);
                break;
            case 2:
                System.out.println("Anda memilih Fahrenheit");
                System.out.print("Masukkan suhu ");
                suhu = input.nextDouble();
                System.out.println("Ingin di konversikan kemana");
                System.out.println("1. Celcius");
                System.out.println("2. Reamur");
                System.out.println("3. Kelvin");
                System.out.print("Pilihan anda ");
                convert = input.nextInt();
                hasil = obj.Fah(suhu, convert);
                System.out.println("Hasil convert dari pilihan anda adalah " +hasil);
                break;
            case 3:
                System.out.println("Anda memilih Reamur");
                System.out.print("Masukkan suhu ");
                suhu = input.nextDouble();
                System.out.println("Ingin di konversikan kemana");
                System.out.println("1. Celcius");
                System.out.println("2. Fahrenheit");
                System.out.println("3. Kelvin");
                System.out.print("Pilihan anda ");
                convert = input.nextInt();
                hasil = obj.Rem(suhu, convert);
                System.out.println("Hasil convert dari pilihan anda adalah " +hasil);
                break;
            case 4:
                System.out.println("Anda memilih Kelvin");
                System.out.print("Masukkan suhu ");
                suhu = input.nextDouble();
                System.out.println("Ingin di konversikan kemana");
                System.out.println("1. Celcius");
                System.out.println("2. Fahrenheit");
                System.out.println("3. Reamur");
                System.out.print("Pilihan anda ");
                convert = input.nextInt();
                hasil = obj.Kel(suhu, convert);
                System.out.println("Hasil convert dari pilihan anda adalah " +hasil);
                break;
            case 5:
                System.out.println("terimakasih sudah menggunakan program kami ^_^");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
                   
        }
        if ( pil == 5){
            break;
        } else {
            System.out.print("Apakah anda ingin mengulang kembali [Y/N]");
            System.out.println("");
            ulang = input.next();
        }
       
        }while(ulang.equals("Y")|| ulang.equals("y"));
        
         }catch(Exception e){
            System.out.println("kesalahan " + e);
        }
        
    }
    
}