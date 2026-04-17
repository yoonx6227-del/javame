import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

        double[] scores = new double[10];
        Scanner sc = new Scanner(System.in);

        // 1. 입력
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번 학생 점수 입력: ");
            scores[i] = sc.nextDouble();
        }

        // 2. 합계 & 평균
        double sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        double avg = sum / scores.length;

        System.out.println("\n총합: " + sum);
        System.out.println("평균: " + avg);

        // 3. 최댓값 찾기
        double max = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        System.out.println("최고 점수: " + max);

        // 4. 오름차순 정렬 (선택정렬)
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = i + 1; j < scores.length; j++) {

                if (scores[i] > scores[j]) {
                    double temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        }

        // 정렬 결과 출력
        System.out.println("\n오름차순 정렬 결과:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]+" ");
        }

        sc.close();
    }
}