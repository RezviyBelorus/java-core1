package homework.task_4;

public class Nomultiplication {
    public static void main(String[]args) {
        int A = 11;
        int B = 2;
        int intermediateResultSum = 0;
        int resultMultiplicationsAB = 0;
        int iterationCounter = 0;
        for (iterationCounter = 0; iterationCounter < B; iterationCounter++) {
            intermediateResultSum = A + resultMultiplicationsAB;
            resultMultiplicationsAB = intermediateResultSum;
        }
        System.out.println(resultMultiplicationsAB);
    }

}
