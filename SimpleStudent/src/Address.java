public class Address {
  // 클래스의 멤버 변수 선언 부분
  private String streetAddress;  // 도로명 주소
  private String city;           // 도시 이름
  private String state;          // 주(도) 이름

  // 클래스 생성자: Address 객체를 생성할 때 초기화하는 역할을 합니다.
  public Address(String streetAddress, String city, String state) {
      this.streetAddress = streetAddress;  // 도로명 주소 초기화
      this.city = city;                    // 도시 이름 초기화
      this.state = state;                  // 주(도) 이름 초기화
  }

  // getInfo 메소드: 주소 정보를 문자열로 반환하는 기능
  public String getInfo() {
      return String.format("%s, %s, %s", streetAddress, city, state);  // 도로명 주소, 도시, 주를 문자열 형태로 포맷하여 반환
  }
}
