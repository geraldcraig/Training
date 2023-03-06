import React from "react";
import { Container, Row } from "react-bootstrap";

const Footer = () => {
    return (
        <footer>
            <Container>
                <Row><hr style={{ color: "blue" }}></hr></Row>
                <Row style={{ color: 'blue', textAlign: 'center'}}>
                    <h5>&copy; Copyright 2023. All Rights Reserved.</h5>
                </Row>
            </Container>
        </footer>
    );
};

export default Footer;