declare num number;
begin
select count(1) into num
from USER_SEQUENCES
where SEQUENCE_NAME = 'USER_ID_SEQ';
if num > 0 then execute immediate 'DROP SEQUENCE USER_ID_SEQ';
end if;
end;

create sequence USER_ID_SEQ increment by 1 start with 1 maxvalue 999999999 nocycle nocache;
declare num number;
begin
select count(1) into num
from USER_SEQUENCES
where SEQUENCE_NAME = 'ROLE_ID_SEQ';
if num > 0 then execute immediate 'DROP SEQUENCE ROLE_ID_SEQ';
end if;
end;

create sequence ROLE_ID_SEQ increment by 1 start with 1 maxvalue 999999999 nocycle nocache;
declare num number;
begin
select count(1) into num
from USER_SEQUENCES
where SEQUENCE_NAME = 'USER_ROLE_ID_SEQ';
if num > 0 then execute immediate 'DROP SEQUENCE USER_ROLE_ID_SEQ';
end if;
end;

create sequence USER_ROLE_ID_SEQ increment by 1 start with 1 maxvalue 999999999 nocycle nocache;
declare num number;
begin
select count(1) into num
from user_tables
where table_name = upper('users');
if num > 0 then execute immediate 'drop table users';
end if;
end;

create TABLE users (
    id NUMBER(11),
    login_id varchar(32) NOT NULL,
    org_id NUMBER(11) NOT NULL,
    password varchar(80) DEFAULT NULL,
    name varchar(50) DEFAULT NULL,
    email varchar(50) DEFAULT NULL,
    contact varchar(30) DEFAULT NULL,
    is_deleted varchar(1) DEFAULT '0',
    is_locked varchar(1) DEFAULT '0',
    last_login_at TIMESTAMP DEFAULT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by varchar(30) DEFAULT NULL,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_by varchar(30) DEFAULT NULL,
    PRIMARY KEY (id),
    CONSTRAINT users_name_unique UNIQUE (name),
    CONSTRAINT users_email_unique UNIQUE (email),
    CONSTRAINT users_login_id_unique UNIQUE (login_id)
);

declare num number;
begin
select count(1) into num
from user_tables
where table_name = upper('roles');
if num > 0 then execute immediate 'drop table roles';
end if;
end;

create TABLE roles (
    id NUMBER(11),
    name varchar(60) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT roles_name_unique UNIQUE (name)
);

declare num number;
begin
select count(1) into num
from user_tables
where table_name = upper('user_roles');
if num > 0 then execute immediate 'drop table user_roles';
end if;
end;

create TABLE user_roles (
    id NUMBER(11),
    user_id NUMBER(11) NOT NULL,
    role_id NUMBER(11) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT role_id_unique UNIQUE (user_id, role_id)
);

declare num number;
begin
select count(1) into num
from user_tables
where table_name = upper('requests');
if num > 0 then execute immediate 'drop table requests';
end if;
end;

create TABLE requests (
    id NUMBER(11),
    request_id varchar(20) NOT NULL,
    name varchar(60) NOT NULL,
    request_type varchar(20) NOT NULL,
    content varchar(200) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by varchar(30) DEFAULT NULL,
    PRIMARY KEY (id),
    CONSTRAINT req_id_unique UNIQUE (request_id)
);

create TABLE organizations (
    id NUMBER(11),
    name varchar(60) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT org_name_unique UNIQUE (name)
};
