public class StudentDemo {
  // 메인 메소드: 프로그램의 진입점입니다.
  public static void main(String[] args) {
      // home 주소 객체 생성
      Address home = new Address("123 Maple St", "Seoul", "Seoul");
      // school 주소 객체 생성
      Address school = new Address("1 University Ave", "Seoul", "Seoul");
      // 학생 객체 생성. 이름은 John Doe이며, 집 주소와 학교 주소 정보를 포함합니다.
      Student student = new Student("John Doe", home, school);

      // 학생 정보 출력
      System.out.println(student.getInfo());  // Student 클래스의 getInfo() 메소드를 호출하여 학생 정보를 출력합니다.
  }
}
