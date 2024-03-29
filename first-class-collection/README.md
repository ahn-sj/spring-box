## 일급 컬렉션(first-class-collection)

두 달 전에 일급 컬렉션에 대해서 다룬 적이 있다. <br/>
그 당시에는 일급 컬렉션이 무엇인지만 이해했을 뿐 어떤 상황에 적시적소에 써야하는 지 몰랐다. <br/>
https://jay-ya.tistory.com/45

그러던 와중에 김영한 님의 JPA 기본편 값 타입 파트를 듣다가 일급 컬렉션과 **매우** 유사한 부분이 있었고, 지난 번에 기록했던 것이 생각나서 실제로 적용해보고자 시작하게 되었다.

참고차 값 타입 컬렉션 대안에 대해서도 추가를 해보겠다.
```
실무에서는 상황에 따라 값 타입 컬렉션 대신에 일대다 관계를 고려해야 한다.
일대다 관계를 위한 엔티티를 만들고, 여기에서 값 타입을 사용하는 것이다.
영속성 전이(Cascade) + 고아 객체 제거(orphanRemoval)를 사용해서 값 타입 컬렉션처럼 사용한다.
```

---

한 가지 상황을 주고 시작하고 싶다는 생각이 들었고, 그에 대한 요구사항은 다음과 같이 정의하였다.

### [필수 요구 사항]
값 타입이 아닌 엔티티로 다룰 것이기 때문에 추적의 여지가 존재해야 한다. <br/>

### [시나리오]
**스터디 모집 서비스**

요구사항 1. ~~스터디 모집 글에는 여러 개의 태그를 달 수 있다.~~ <br/>
요구사항 2. ~~한 개의 태그는 여러 개의 스터디 모집 글에 포함될 수 있다.~~ <br/>
요구사랑 3. ~~태그가 중복될 경우 한 가지의 태그만 달 수 있다.~~ <br/>
요구사항 4. ~~태그는 최대 5개까지만 가능하다.~~<br/>



**참고**<br/>
- [링크](https://lovecode.tistory.com/52)
- [링크](https://blogshine.tistory.com/475)
- [링크](https://github.com/woowacourse-teams/2021-botobo/blob/b2a548247d/backend/src/main/java/botobo/core/domain/tag/Tags.java)
- [링크](https://bgpark.tistory.com/156)

**트러블슈팅**<br/>
- [링크](https://heekng.tistory.com/151)
- [링크](https://conservative-vector.tistory.com/entry/%EC%98%A4%EB%A5%98)
- [링크](https://webcache.googleusercontent.com/search?q=cache:Iycw7PgL5MYJ:https://hianna.tistory.com/582&cd=2&hl=ko&ct=clnk&gl=kr)