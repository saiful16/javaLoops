public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int min = Math.min(first, second);
        int temp = 0;
        for (int i = 1; i < min; i++) {
              if (first % i == 0 && second % i == 0) {
                  temp = i;
              }
          }
          return temp;
        }

        public static void main(String[] args) {
            System.out.println(getGreatestCommonDivisor(90,46));
        }
    }

