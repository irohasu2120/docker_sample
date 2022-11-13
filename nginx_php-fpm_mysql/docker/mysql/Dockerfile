FROM mysql:8.0.31

# COPY ddl.sql /docker-entrypoint-initdb.d/ddl.sql

# ENV LANG ja_JP.UTF-8
# ENV LANGUAGE ja_JP:ja
# ENV LC_ALL ja_JP.UTF-8

COPY conf.d/mysqld_charset.cnf /etc/mysql/conf.d/mysqld_charset.cnf
