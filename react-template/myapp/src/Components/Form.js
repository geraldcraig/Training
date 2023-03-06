import React, {useState, useEffect} from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import {Form, Button, Row, Col, Card} from "react-bootstrap";


function ItemForm({addItem, updateItem, editing, setEditing, currentItem}) {
    const initialFormState = {id: null, name: '', description: '', price: '', stock: ''};
    const [item, setItem] = useState(initialFormState);

    // The useEffect is a hook to fetch the list of items from the API when the component mounts.
    useEffect(() => {
        if (editing) {
            setItem(currentItem);
        }
    }, [currentItem, editing]);

    const handleChange = event => {
        const {name, value} = event.target;
        setItem({...item, [name]: value});
    };
    const handleSubmit = event => {
        event.preventDefault();
        if (!item.name || !item.description || !item.price || !item.stock) return;
        if (editing) {
            updateItem(item.id, item);
        } else {
            addItem(item);
        }
        setItem(initialFormState);
    };

    const handleCancel = event => {
        setItem(initialFormState);
        setEditing(false);
    };

    return (
        <Form onSubmit={handleSubmit}>

            <Row className="mb-3">
                <Form.Group as={Col} controlId="formItemName">
                    <Form.Label>Item Name</Form.Label>
                    <Form.Control type="text" name="name" value={item.name} onChange={handleChange}
                                  placeholder="Enter the item name"/>
                </Form.Group>

                <Form.Group as={Col} controlId="formItemDescription">
                    <Form.Label>Item Description</Form.Label>
                    <Form.Control type="text" name="description" value={item.description}
                                  onChange={handleChange}
                                  placeholder="Enter the item description"/>
                </Form.Group>

                <Form.Group as={Col} controlId="formItemPrice">
                    <Form.Label>Item Price</Form.Label>
                    <Form.Control type="number" name="price" value={item.price} onChange={handleChange}
                                  placeholder="Enter the item price"/>
                </Form.Group>

                <Form.Group as={Col} controlId="formItemQuantity">
                    <Form.Label>Stock Quantity</Form.Label>
                    <Form.Control type="number" name="stock" value={item.stock} onChange={handleChange}
                                  placeholder="Enter the stock level"/>
                </Form.Group>
            </Row>

            {editing ? (
                <div>
                    <Button variant="outline-success" type="submit">Update Item</Button>
                    <Button variant="outline-danger" onClick={() => handleCancel()}>Cancel</Button>
                </div>
            ) : (
                <div>
                    <Button variant="outline-success" type="submit">Add Item</Button>
                </div>
            )}
        </Form>
    );
}

export default ItemForm;