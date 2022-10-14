package Zadanie2Korczak;

public class Zadanie2Korczak {
    public static void main(String[] args) {
        float ziemiaWeightKorczak = 78.0F;
        float marsWeightKorczak = ziemiaWeightKorczak * 0.38F;

        double marsWeightKorczakDB = marsWeightKorczak;
        System.out.println("Moja waga na Marsie wynosi (w typie double): "+marsWeightKorczakDB);
        System.out.printf("Moja waga na Marsie wynosi (w typie double zaokrąglona do 4 miejsc po przecinku): %.4f %n",marsWeightKorczakDB);
        int marsWeightKorczakINT = (int)marsWeightKorczakDB;
        System.out.println("Moja waga na Marsie wynosi (w typie int): "+marsWeightKorczakINT);
        char marsWeightKorczakCHAR = (char)marsWeightKorczakINT;
        System.out.println("Moja waga na Marsie wynosi (w typie char): "+marsWeightKorczakCHAR);
        int dzialanienacharKorczak=(int)(marsWeightKorczakCHAR + 312);
        System.out.println("Dzialanie na char (w typie int): "+dzialanienacharKorczak);



    }
}
