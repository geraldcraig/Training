import React from "react";
import { Button, Card, Form } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';

function Coursename({ courseitem, index, markCourseitem, removeCourseitem }) {
    return (
        <div className="courseitem">
            <span style={{ textDecoration: courseitem.haveCompleted ? "line-through" : ""}}>{courseitem.itemdetails}</span>
            <div>
                <Button variant="outline-success" onClick={() => markCourseitem(index)}>X</Button>{''}
                <Button variant="outline-danger" onClick={() => removeCourseitem(index)}>X</Button>
            </div>
        </div>
    );
}

function FormCoursename({ addCoursename }) {
    // React Hook for the value which is a variable
    const [value, setValue] = React.useState("");

    const handleSubmit = e => {
        e.preventDefault();
        if (!value) return;
        addCoursename(value);
        setValue("");
    };

    return (
        <Form onSubmit={handleSubmit}>
            <Form.Group>
                <Form.Label><b>Add a new course item</b></Form.Label>
                <Form.Control type="text" className="input" value={value} onChange={e => setValue(e.target.value)} placeholder="Add the new course item here" />
            </Form.Group>
            <Button variant="success mb-3" type="submit">Update the course list</Button>
        </Form>
    );
}

function App() {
    const [courseitems, setCoursenames] = React.useState([{
        "id": 1,
        "itemdetails": "Learn some Java",
        "haveCompleted": true
    }, {
        "id": 2,
        "itemdetails": "Learn some HTML",
        "haveCompleted": true
    }, {
        "id": 3,
        "itemdetails": "Learn some CSS",
        "haveCompleted": true
    }, {
        "id": 4,
        "itemdetails": "Learn some JavaScript",
        "haveCompleted": true
    }, {
        "id": 5,
        "itemdetails": "Learn some ReactJs",
        "haveCompleted": false
    }, {
        "id": 6,
        "itemdetails": "Learn some Spring Boot",
        "haveCompleted": false
    }, {
        "id": 7,
        "itemdetails": "Pick up my Java Credly badge",
        "haveCompleted": true
    }, {
        "id": 8,
        "itemdetails": "Pick up my JavaScript/HTML/CSS Credly badge",
        "haveCompleted": false
    }, {
        "id": 9,
        "itemdetails": "Pick up my ReactJs/Spring Boot Credly badge",
        "haveCompleted": false
    }, {
        "id": 10,
        "itemdetails": "Complete the Java Project",
        "haveCompleted": true
    }, {
        "id": 11,
        "itemdetails": "Complete the JavaScript/HTML/CSS Project",
        "haveCompleted": true
    }, {
        "id": 12,
        "itemdetails": "Complete the ReactJs/Spring Boot Project",
        "haveCompleted": true
    }]);


    const addCoursename = itemdetails => {
        const newCoursenames = [...courseitems, { itemdetails }];
        setCoursenames(newCoursenames);
    };

    const markCourseitem = index => {
        const newCoursenames = [...courseitems];
        newCoursenames[index].haveCompleted = !newCoursenames[index].haveCompleted;
        setCoursenames(newCoursenames);
    };

    const removeCourseitem = index => {
        const newCoursenames = [...courseitems];
        newCoursenames.splice(index, 1);
        setCoursenames(newCoursenames);
    };

    return (
        <div className="app">
            <div className="container">
                <h1 className="text-center mb-4">Bridge TechEx - Study List</h1>
                <FormCoursename addCoursename={addCoursename} />
                <div>
                    {courseitems.map((courseitem, index) => (
                        <Card>
                            <Card.Body>
                                <Coursename
                                    key={index}
                                    index={index}
                                    courseitem={courseitem}
                                    markCourseitem={markCourseitem}
                                    removeCourseitem={removeCourseitem}
                                />
                            </Card.Body>
                        </Card>
                    ))}
                </div>
            </div>
        </div>
    );

}

export default App;
