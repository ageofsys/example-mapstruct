# MapStruct

## Lombok과 연동하기
```groovy
annotationProcessor 'org.mapstruct:mapstruct-processor:1.4.2.Final'
annotationProcessor 'org.projectlombok:lombok:1.18.22'
annotationProcessor 'org.projectlombok:lombok-mapstruct-binding:0.2.0'
```

## 문서에 나오는 @Default 애너테이션
문서 샘플 코드에 나오는 @Default 애너테이션은 라이브러리에 포함된 내용이 아니다. 아래 링크를 참조해서 만들어줘야 된다.
https://mapstruct.org/documentation/stable/reference/html/#non-shipped-annotations