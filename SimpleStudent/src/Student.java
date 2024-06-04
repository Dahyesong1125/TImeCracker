public class Student {
  // 클래스의 멤버 변수 선언 부분
  private String name;            // 학생의 이름
  private Address homeAddress;    // 집 주소를 저장하는 Address 타입의 변수
  private Address schoolAddress;  // 학교 주소를 저장하는 Address 타입의 변수

  // 클래스 생성자: Student 객체를 생성할 때 초기화하는 역할을 합니다.
  public Student(String name, Address homeAddress, Address schoolAddress) {
      this.name = name;                    // 학생 이름 초기화
      this.homeAddress = homeAddress;      // 집 주소 초기화
      this.schoolAddress = schoolAddress;  // 학교 주소 초기화
  }

  // getInfo 메소드: 학생의 이름, 집 주소, 학교 주소 정보를 문자열로 반환하는 기능
  public String getInfo() {
      // Address 클래스의 getInfo() 메소드를 사용하여 각 주소의 정보를 문자열로 가져온 후 학생 정보를 조합합니다.
      return String.format("Name: %s\nHome Address: %s\nSchool Address: %s",
                           name, homeAddress.getInfo(), schoolAddress.getInfo());
  }
}
