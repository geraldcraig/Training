import { NavLink } from 'react-router-dom';
import '../App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Container, Row, Card } from 'react-bootstrap';

const Header = () => {
    const style = ({ isActive }) => ({
        fontWeight: isActive ? 'bold' : 'normal',
    });

    return (
        <>
            <Container className="card border-primary mb-12">
                <Row className="card border-primary mb-12">
                    <Card style={{ width: '120rem' }}>
                        <h1 style={{ color: 'blue', textAlign: 'center' }}>Audio Processing App</h1>
                    </Card>

                    <Card.Body>
                        <nav>
                            <div className='container'>
                                <div className='table-responsive'>
                                    <table className='table'>
                                        <thead>
                                            <tr>
                                                <th><NavLink to="/home" style={style}>Home</NavLink></th>
                                                <th><NavLink to="/player" style={style}>Player</NavLink></th>
                                                <th><NavLink to="/model" style={style}>Model Training</NavLink></th>
                                            </tr>
                                        </thead>
                                    </table>
                                </div>
                            </div>
                        </nav>
                    </Card.Body>    
                </Row>
            </Container>
        </>
    );
}

export default Header;

