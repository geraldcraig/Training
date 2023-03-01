import React from "react";
import { Container, Row, Col } from "react-bootstrap";
import headingimage from '../assets/sunset.jpeg'

const Header = () => {
    return (
        <header>
            <Container>
                <Row>
                    <Col md={2}>
                    </Col>
                    <Col md={8}>
                        <img src={headingimage} alt="image" style={{ width: '100%'}} />
                    </Col>
                    <Col md={2}>
                    </Col>
                </Row>
            </Container>
        </header>
    );
};

export default Header;