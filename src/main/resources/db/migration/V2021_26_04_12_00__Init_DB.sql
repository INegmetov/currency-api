CREATE TABLE curs_data(
    id SERIAL NOT NULL,
    currency VARCHAR(3),
    curs int,
    curs_date DATE
);

CREATE UNIQUE INDEX address_id_uindex ON public.curs_data(id);