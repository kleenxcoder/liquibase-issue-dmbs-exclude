# liquibase-issue-dmbs-exclude
seems like dbms="!mssql" does not work correctly

According to [liquibase documentation](https://docs.liquibase.com/concepts/changelogs/changelog-formats.html) one should be able to specify a changeset which is not applicable to a particular database by prefixing dbms by an exclamation mark "!" . For Example dbms="!oracle".

But it looks like this does not work when using h2 database. In this sample you will find some changes excluding oracle and mssql. After running liquibase the changeset's are not applied to h2.

How to reprocude:
* run: mvn liquibase:update
* run: Spring Application IssueDmbsExcludeApplication
* open [h2-console](http://localhost:8080/h2-console/) using JDBC URL "jdbc:h2:file:./db-file/my-sample-db"
 