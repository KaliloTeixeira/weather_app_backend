-- Table: cityweather

-- PostgresSQL

DROP TABLE IF EXISTS cityweather;

CREATE TABLE IF NOT EXISTS cityweather
(
    id integer NOT NULL DEFAULT nextval('cityweather_id_seq'::regclass),
    cityname character varying(50) COLLATE pg_catalog."default",
    temperature double precision,
    "time" timestamp without time zone,
    CONSTRAINT cityweather_pkey PRIMARY KEY (id),
    CONSTRAINT cityname_cn UNIQUE (cityname),
    CONSTRAINT cityweather_cityname_key UNIQUE (cityname)
)
