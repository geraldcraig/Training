import React, { useState, useEffect } from 'react';
import { Container, Row, Button, Card } from 'react-bootstrap';

function ProductList() {
    const [products, setProducts] = useState([]);
    const initialFormState = { id: null, name: '', description: '', price: '', stock: '' };
    const [currentProduct, setCurrentProduct] = useState(initialFormState);
    const baseURL = "http://localhost:8080";

    useEffect(() => {
        fetch(`${baseURL}/api/products`)
        .then(response => response.json())
        .then(data => setProducts(data));
    }, []);

    return (
        <>
            <Container>
                <Row>
                    <Card className='card border-primary mb-3' style={{ width: '120rem' }}>
                        <Card.Header style={{ backgroundColor: 'green' }}>
                            <h3 style={{ color: 'white', textAlign: 'center' }}>Product List</h3>
                        </Card.Header>
                        <Card.Body>
                            <div>
                                <table className='table table-sm table-striped table-bordered table-hover'>
                                    <thead className='thead-light'>
                                        <tr>
                                            <th>Name</th>
                                            <th>Description</th>
                                            <th>Price</th>
                                            <th>Stock</th>
                                            <th>Edit Product</th>
                                            <th>Delete Product</th>
                                        </tr>
                                    </thead>

                                    <tbody style={{ textAlign: 'left' }}>
                                        {products.map(product => (
                                            <tr key={product.id}>
                                                <td>{product.name}</td>
                                                <td>{product.description}</td>
                                                <td>{product.price}</td>
                                                <td>{product.stock}</td>
                                                <td>Edit</td>
                                                <td>Delete</td>
                                            </tr>
                                        ))}
                                    </tbody>
                                </table>
                            </div>
                        </Card.Body>
                    </Card>
                </Row>
            </Container>
        </>
    )
};

export default ProductList;