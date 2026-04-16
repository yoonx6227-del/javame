public class Test {
    public static void main(String[] args) {
        
        //double[] score = new double[10];
        
        double[] score = {50,55,60,65,70,75,80,85,90,95};
        double sum = 0;
        
       
       for(int i=0; i<=9; i++){
             sum += score[i];
        }

        System.out.println("총합 : " +sum);

        double avg = (double)sum / 10;
        System.out.println("평균 : " +avg);

    }
}



        
     


