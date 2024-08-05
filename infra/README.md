# INFRA

- baackend project에서 사용 할 infra를 세팅하기위한 코드를 모아둡니다
- docker-compose 로 작성되어있습니다

## 사용법
- `docker-compose.yml`, `init.sql` 를 원하는 프로젝트에 복사 해 넣습니다
- `init.sql`에 원하는 schema를 작성합니다
- `docker-compose.yml` 파일에서 각 정보를 원하는 정보로 수정합니다
- `docker-compose up -d` 로 docker-compose 파일을 실행시킵니다
