# project-haja
All of haja

'프로젝트 하자'는 개발자가 되고 싶은 대학생 김성원의 토이 프로젝트의 총칭이다.

discuss haja

고민 공유 및 기록, 조언이 필요한 사용자를 위한 커뮤니티 사이트 구축 프로젝트이다.

1. 요구 사항
    1.1 고민이라는 것은 매우 민감한 내용일 수 있기 때문에 권한별 접근 제한을 설정한다.
    1.2 Stack Overflow, Redmine과 유사한 성격의 웹 사이트이니 일부 기능은 동일하게 개발한다.
	    - 실시간 고민 기능 개발 고려
    1.3 도메인은 확장을 고려하여 ○○○○.haja.com 형식를 따른다.
    1.4 고민 데이터가 없거나 매우 부족할 경우를 대비하여 고민 Crawler를 개발하여 고민 데이터를 확보한다.

2. 기술 스택
	language 	- Java
	template engine -Freemarker
	Framework - Spring Boot
	    - Spring Security + Spring Data JPA + Hibernate
	Database - MySQL, Redis

3. 기능
    1. 사용자
        1.1 실시간 고민
        1.2 관심 고민
        1.3 고민 토론
        1.4 고민 순위
        1.5 자유 게시판
        1.6 내 정보
            1.6.1 개인 정보 
            1.6.2 나의 고민
            1.6.3 나의 답변
            1.6.4 나의 관심사

    2. 관리자
        2.1 사용자 관리
        2.2 고민 관리
        
        
discuss-crawler (discuss-scraper)

discuss haja의 초기 데이터, 사회적 이슈에 관한 자료들을 수집(크롤링)하는 플리케이션을 개발한다.

준비 중...
