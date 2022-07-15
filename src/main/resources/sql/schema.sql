CREATE DATABASE reporting;

CREATE TABLE call (
    callId          VARCHAR(60) PRIMARY KEY,
    startDate       DATE NOT NULL,
    endDate         DATE,
    costumerNumber  VARCHAR(15),
    outcome         VARCHAR(40)
)