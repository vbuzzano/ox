# --- First database schema
 
# --- !Ups
 
CREATE TABLE ox_entity (
  id                        SERIAL PRIMARY KEY,
  uid                       VARCHAR(36) NOT NULL,
  name                      VARCHAR(100) NOT NULL,
  tablename                 VARCHAR(60) NOT NULL
);

CREATE UNIQUE INDEX OX_ENTITY_UID ON ox_entity (uid);
CREATE UNIQUE INDEX OX_ENTITY_TABLENAME ON ox_entity (tablename);

# --- !Downs
 
DROP TABLE IF EXISTS ox_entity;
