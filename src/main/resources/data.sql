insert into organizations(id, name) values(1, 'Org A');
insert into organizations(id, name) values(2, 'Org B');
insert into organizations(id, name) values(3, 'Org C');

insert into users(id, login_id, org_id, password, name, email, contact, is_locked, is_deleted, created_at, created_by, updated_at, updated_by)
    values (USER_ID_SEQ.nextval,'admin', 1, '21232f297a57a5a743894a0e4a801fc3','Admin User','admin@tca.sg','1232131231',0,0,current_timestamp,'System',current_timestamp,'System');
insert into users(id, login_id, org_id, password, name, email, contact, is_locked, is_deleted, created_at, created_by, updated_at, updated_by)
    values (USER_ID_SEQ.nextval,'enquiry', 2, '21232f297a57a5a743894a0e4a801fc3','Enquiry User','enquiry@tca.sg','1232131231',0,0,current_timestamp,'System',current_timestamp,'System');

insert into roles(id,name) values(ROLE_ID_SEQ.nextval,'ROLE_ADMIN');
insert into roles(id,name) values(ROLE_ID_SEQ.nextval,'ROLE_ENQUIRY');
insert into roles(id,name) values(ROLE_ID_SEQ.nextval,'ROLE_REPORT');

insert into user_roles(id, user_id, role_id) values(USER_ROLE_ID_SEQ.nextval, 1, 1);
insert into user_roles(id, user_id, role_id) values(USER_ROLE_ID_SEQ.nextval, 1, 2);
insert into user_roles(id, user_id, role_id) values(USER_ROLE_ID_SEQ.nextval, 1, 3);
insert into user_roles(id, user_id, role_id) values(USER_ROLE_ID_SEQ.nextval, 2, 2);

insert into requests(id,request_id,name,request_type,content,created_by)
    values(ROLE_ID_SEQ.nextval,'requestId' || ROLE_ID_SEQ.nextval,'request name','request_type','request content','ADMIN');
insert into requests(id,request_id,name,request_type,content,created_by)
    values(ROLE_ID_SEQ.nextval,'requestId' || ROLE_ID_SEQ.nextval,'request name','request_type','request content','ADMIN');
insert into requests(id,request_id,name,request_type,content,created_by)
    values(ROLE_ID_SEQ.nextval,'requestId' || ROLE_ID_SEQ.nextval,'request name','request_type','request content','ADMIN');
insert into requests(id,request_id,name,request_type,content,created_by)
    values(ROLE_ID_SEQ.nextval,'requestId' || ROLE_ID_SEQ.nextval,'request name','request_type','request content','ADMIN');
insert into requests(id,request_id,name,request_type,content,created_by)
    values(ROLE_ID_SEQ.nextval,'requestId' || ROLE_ID_SEQ.nextval,'request name','request_type','request content','ADMIN');
insert into requests(id,request_id,name,request_type,content,created_by)
    values(ROLE_ID_SEQ.nextval,'requestId' || ROLE_ID_SEQ.nextval,'request name','request_type','request content','ADMIN');
insert into requests(id,request_id,name,request_type,content,created_by)
    values(ROLE_ID_SEQ.nextval,'requestId' || ROLE_ID_SEQ.nextval,'request name','request_type','request content','ADMIN');
insert into requests(id,request_id,name,request_type,content,created_by)
    values(ROLE_ID_SEQ.nextval,'requestId' || ROLE_ID_SEQ.nextval,'request name','request_type','request content','ADMIN');
insert into requests(id,request_id,name,request_type,content,created_by)
    values(ROLE_ID_SEQ.nextval,'requestId' || ROLE_ID_SEQ.nextval,'request name','request_type','request content','ADMIN');
insert into requests(id,request_id,name,request_type,content,created_by)
    values(ROLE_ID_SEQ.nextval,'requestId' || ROLE_ID_SEQ.nextval,'request name','request_type','request content','ADMIN');
insert into requests(id,request_id,name,request_type,content,created_by)
    values(ROLE_ID_SEQ.nextval,'requestId' || ROLE_ID_SEQ.nextval,'request name','request_type','request content','ADMIN');
insert into requests(id,request_id,name,request_type,content,created_by)
    values(ROLE_ID_SEQ.nextval,'requestId' || ROLE_ID_SEQ.nextval,'request name','request_type','request content','ADMIN');
insert into requests(id,request_id,name,request_type,content,created_by)
    values(ROLE_ID_SEQ.nextval,'requestId' || ROLE_ID_SEQ.nextval,'request name','request_type','request content','ADMIN');
insert into requests(id,request_id,name,request_type,content,created_by)
    values(ROLE_ID_SEQ.nextval,'requestId' || ROLE_ID_SEQ.nextval,'request name','request_type','request content','ADMIN');

