import React, {useState, useEffect} from "react";
// import Form from './Form';
import {Container, Row, Button, Card} from 'react-bootstrap';


function List() {
    const [items, setItems] = useState([]);
    // const [editing, setEditing] useState(false);
    const initialFormState = {id: null, name: '', description: '', price: '', stock: ''};
    // const [currentItem, setCurrentItem] = useState(initialFormState);
    const baseURL = "http://localhost:8080";

    // The useEffect is a hook to fetch the lst of items from the API when the component mounts.
    useEffect(() => {
        fetch(`${baseURL}/api/items`)
            .then(response => response.json())
            .then(data => setItems(data));
    }, []);

    // const editRow = item => {
    //     setEditing(true);
    //     setCurrentItem({id: item.id, name: item.name, description: item.description, price: item.price, stock: item.stock})
    // };

    return (
        <>
            <Container>
                <Row>
                    <Card className="card border-primary mb-3" style={{width: '120rem'}}>
                        <Card.Header style={{backgroundColor: 'green'}}>
                            <h3 style={{color: 'white', textAlign: 'center'}}>Item List</h3>
                        </Card.Header>
                        <Card.Body>
                            <div>
                                <table className="table table-sm table-striped table-bordered table-hover ">
                                    <thead className="thead-light">
                                    <tr>
                                        <th>Name</th>
                                        <th>Description</th>
                                        <th>Price</th>
                                        <th>Stock</th>
                                        <th>Edit Item</th>
                                        <th>Delete Item</th>
                                    </tr>
                                    </thead>

                                    <tbody style={{textAlign: 'left'}}>
                                    {items.map(item => (
                                        <tr key={item.id}>
                                            <td>{item.name}</td>
                                            <td>{item.description}</td>
                                            <td>{item.price}</td>
                                            <td style={{textAlign: 'right'}}>{item.stock}</td>
                                            {/*<td style={{textAlign: 'center'}}>*/}
                                            {/*    <Button variant="outline-primary"*/}
                                            {/*            onClick={() => editRow(item)}>Edit</Button>*/}
                                            {/*</td>*/}
                                            {/*<td style={{textAlign: 'center'}}>*/}
                                            {/*    <Button variant="outline-danger"*/}
                                            {/*            onClick={() => deleteItem(item.id)}>Delete</Button>*/}
                                            {/*</td>*/}
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
    );
};

export default List;