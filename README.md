## DATABASE
|----|---------|---------|
|uid |username |password |
|----|---------|---------|
|1   |userid   |password |
|----|---------|---------|
- 이런으로 db가 있다는 가정 하에 인터셉터를 이용한 로그인을 구현했습니다.

## Login 흐름
MemberController.java (GET localhost:8080/loginForm )

-> loginForm.jsp (아이디와 비밀번호 입력 후 로그인 버튼 클릭)

-> MemberController.java ( POST localhost:8080/loginProcess )

-> MemberService.getMember(Member member)

-> MemberMapper
(select * from springpractice.test_member where username = #{username} )

...


- 아이디와 패스워드가 일치할 때 index.jsp
-> LoginInterceptor.java ( postHandle(...) )

- 아이디와 패스워드가 맞지 않을 때 loginForm.jsp -> -> LoginInterceptor.java ( postHandle(...) )