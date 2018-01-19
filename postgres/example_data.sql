

--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.9
-- Dumped by pg_dump version 9.6.6

-- Started on 2018-01-18 12:36:32 CET



--
-- TOC entry 2197 (class 0 OID 16811)
-- Dependencies: 182
-- Data for Name: customer; Type: TABLE DATA; Schema: public; Owner: docker
--

INSERT INTO customer VALUES ('33628146-3319-429b-a0fe-769f2e4fa81e', 'Daniel de Pablo');
INSERT INTO customer VALUES ('b9d77685-8c55-45db-a048-6b986fd0527b', 'Pepito Pérez');


--
-- TOC entry 2198 (class 0 OID 16816)
-- Dependencies: 183
-- Data for Name: customer_profile; Type: TABLE DATA; Schema: public; Owner: docker
--

INSERT INTO customer_profile VALUES ('5ba937dc-3e2d-450c-8bb3-dbd0b94b0ad6', '33628146-3319-429b-a0fe-769f2e4fa81e', 'comida');
INSERT INTO customer_profile VALUES ('ded5a85a-e494-43ce-b12c-b6a6720cbeba', '33628146-3319-429b-a0fe-769f2e4fa81e', 'textil');
INSERT INTO customer_profile VALUES ('1929b4ba-03dc-470d-b88f-7fcd3bba3346', 'b9d77685-8c55-45db-a048-6b986fd0527b', 'juguetes');


--
-- TOC entry 2199 (class 0 OID 16826)
-- Dependencies: 185
-- Data for Name: products; Type: TABLE DATA; Schema: public; Owner: docker
--

INSERT INTO product VALUES ('b979113a-fd36-11e7-8be5-0ed5f89f718b', 'textil', '0de3e084-fd36-11e7-8be5-0ed5f89f718b', 'camiseta', '2x1', 10.5);
INSERT INTO product VALUES ('b97913ce-fd36-11e7-8be5-0ed5f89f718b', 'comida', '0de3e084-fd36-11e7-8be5-0ed5f89f718b', 'piña', '2x1', 2);
INSERT INTO product VALUES ('b97915ae-fd36-11e7-8be5-0ed5f89f718b', 'juguetes', '0de3e480-fd36-11e7-8be5-0ed5f89f718b', 'parchis', 'sin iva', 15);
INSERT INTO product VALUES ('b9791702-fd36-11e7-8be5-0ed5f89f718b', 'comida', '0de3e480-fd36-11e7-8be5-0ed5f89f718b', 'pan tostado', '2x1', 1.20000005);


--
-- TOC entry 2200 (class 0 OID 16834)
-- Dependencies: 186
-- Data for Name: stores; Type: TABLE DATA; Schema: public; Owner: docker
--

INSERT INTO store VALUES ('0de3e084-fd36-11e7-8be5-0ed5f89f718b', 'Avenida Santo Amaro, 3271 - Cidade Monções, São Paulo', 'Carrefour Express');
INSERT INTO store VALUES ('0de3e480-fd36-11e7-8be5-0ed5f89f718b', 'Avenida Padre Antônio José dos Santos, 255 - Cidade Monções, São Paulo', 'Carrefour Express Padre Antônio');


-- Completed on 2018-01-18 12:36:32 CET

--
-- PostgreSQL database dump complete
--


