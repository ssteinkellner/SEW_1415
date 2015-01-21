DROP TABLE IF EXISTS BuildToolTest;
CREATE TABLE BuildToolTest (
	knr		VARCHAR(255), /* katalognummer */
	nname	VARCHAR(255), /* nachname */
	vname	VARCHAR(255), /* vorname */
	PRIMARY KEY (nname, knr)
) ENGINE = INNODB;