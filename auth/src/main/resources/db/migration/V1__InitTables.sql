CREATE TABLE "users"(
    id serial primary key,
    uuid varchar not null,
    login varchar not null,
    email varchar not null,
    password varchar not null,
    role varchar not null,
    isLock boolean default true,
    isEnabled boolean default false)
