import java.util.Scanner;

public class StaticQueue {
    private static int[] queue;
    private static int front;
    private static int rear;
    private static int queueSize;

   // 길이가 10인 대기열 배열 초기화
    public static void makeQueueArray() {
        queue = new int[10];
        front = 0;
        rear = 0;
        queueSize = queue.length;
    }

   // 요소를 대기열에 추가하기 위한 push 함수
    public static void push(int element) {
      if (rear == queueSize) {  // 추가하기 전에 대기열이 이미 꽉 찼는지 확인
          System.out.println("큐가 다 찼습니다. 더 이상 추가할 수 없습니다.");
          return;
      }
      queue[rear++] = element;
      if (rear == queueSize && front == 0) { // 푸시 후 대기열이 꽉 찼는지 확인
        // 여기서 논리를 구현하거나 최대 용량의 플래그를 설정할 수 있음
      }
  }
  

// 대기열의 앞 요소를 제거하고 표시하는 pop 함수
    public static void pop() {
      if (front == rear) {
          System.out.println("큐가 비었습니다.");
      } else {
          System.out.println(queue[front] + ", 값이 삭제 되었습니다.");
          front++;
      }
  }

// 대기열의 현재 상태를 표시하는 기능
    public static void showQueueInfo() {
      System.out.println("-------------------------------------------------------");
// 대기열이 꽉 찼고 요소가 터지지 않았는지 확인
      if (rear == queueSize && front == 0) {
          System.out.println("       큐가 다 찼습니다. rear : " + rear + ", front: " + front + ", qSize: " + queueSize);
      } else if (front == rear) {
          System.out.println("       큐가 비었습니다. rear : " + rear + ", front: " + front + ", qSize: " + queueSize);
      } else {
          System.out.print("       큐의 상태 rear : " + rear + ", front: " + front + ", qSize: " + queueSize + "\n");
          System.out.print("                        queue : [");
          for (int i = front; i < rear; i++) {
              System.out.print(queue[i] + (i < rear - 1 ? ", " : ""));
          }
          System.out.println("]");
      }
      System.out.println("-------------------------------------------------------");
  }

    // 필요한 경우 대기열 크기 확장
    private static void expandQueue() {
        int[] newQueue = new int[queueSize * 2];
        System.arraycopy(queue, 0, newQueue, 0, queueSize);
        queue = newQueue;
        queueSize = newQueue.length;
        System.out.println("Expanding Array...");
    }

// 대기열을 원래 상태로 재초기
    public static void initializeQueue() {
        makeQueueArray();
        System.out.println("initializing Queue...");
    }

    public static void main(String[] args) {
        makeQueueArray();
        Scanner scanner = new Scanner(System.in);
        char command;
        
        while (true) {
            System.out.print("Enter a positive number to push, 'p' for pop, 'e' for expand, 's' for showinfo, 'i' for initialize and 'q' to quit: ");
            String input = scanner.nextLine();
            if (input.length() == 1 && input.charAt(0) == 'q') {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            try {
                int num = Integer.parseInt(input);
                push(num);
            } catch (NumberFormatException e) {
                command = input.charAt(0);
                switch (command) {
                    case 'p':
                        pop();
                        break;
                    case 's':
                        showQueueInfo();
                        break;
                    case 'e':
                        expandQueue();
                        showQueueInfo();
                        break;
                    case 'i':
                        initializeQueue();
                        showQueueInfo();
                        break;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            }
        }
        scanner.close();
    }
}
