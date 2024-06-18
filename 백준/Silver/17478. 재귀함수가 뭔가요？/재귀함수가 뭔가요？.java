import java.util.Scanner;

public class Main {

    private static final String question = "\"재귀함수가 뭔가요?\"";
    private static final String answer1 =
            "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    private static final String answer2 =
            "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    private static final String answer3 =
             "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";

    private static final String answer4 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    private static final String endAnswer = "라고 답변하였지.\n";

    private static int underBarCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");

        for (int i = 0; i < N; i++) {
            String underBar = "";
            if (i != 0) {
                underBar = "_".repeat(underBarCount += 4);
            }
            sb.append(underBar).append(question).append("\n")
                    .append(underBar).append(answer1).append("\n")
                    .append(underBar).append(answer2).append("\n")
                    .append(underBar).append(answer3).append("\n");

        }

        sb.append("_".repeat(underBarCount += 4))
                .append(question)
                .append("\n")
                .append("_".repeat(underBarCount))
                .append(answer4)
                .append("\n");


        for (int i = 0; i < N; i++) {
            sb.append("_".repeat(underBarCount))
                    .append(endAnswer);

            underBarCount -= 4;
        }

        sb.append(endAnswer);

        System.out.println(sb);
    }

}
