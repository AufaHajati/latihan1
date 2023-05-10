
package tayo;


public class Tayo {

    
    public static void main(String[] args) {
        void firstMethod (String carBrand, String carColour, int numberOfWheels, int numberPlateCode, String letterPlateCode){
        System.out.println("Merek Mobil     : " + carBrand);
        System.out.println("Jumlah Roda     : " + numberOfWheels);
        System.out.println("Warna Mobil     : " + carColour);
        System.out.println("Plat Nomor      : " +  "BM " + numberPlateCode + "-" + letterPlateCode);
    }

    int secondMethod (int carSpeed, int time){
        System.out.println("Kecepatan Mobil/jam = " + carSpeed + " KM");
        System.out.println("Waktu               = " + time + " Jam");
        int totalRange = carSpeed * time;
        return totalRange;
    }

}
    }
    
}
