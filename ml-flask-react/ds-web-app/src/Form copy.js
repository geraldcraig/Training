import { useState } from "react";

function Form() {
    const [form, setForm] = useState({
        pregnancies: "",
        glucose: "",
        blood_pressure: "",
        skin_thickness: "",
        insulin_level: "",
        bmi: "",
        diabetes_pedigree: "",
        age: ""
        });

    const handleSubmit = (event) => {
        event.preventDefault();
        
        // fetch('https://randomuser.me/api/')
        fetch('http://127.0.0.1:5000/predict', {
            method: "POST",
            body: form_data
        })
        .then(response => response.json())
        .then(data => {
            console.log(data);
            setUser(data.results[0]);
        })

        console.log("Form submitted");
        console.log(form);
    };

    const onChange = (event) => {
        console.log("Changed input field");
        const name = event.target.name;
        const value = event.target.value;

        // console.log(`event.target.name: ${name}, event.target.value: ${value}`);

        setForm({ ...form, [name]: value });
    }

    return (
        <form onSubmit={handleSubmit}>
            <h4>Diabetes Prediction Model</h4>
            <p>Example to Predict Probability of Diabetes</p>
            <input type="number" name="pregnancies" onChange={onChange} placeholder="Number of Pregnancies" />
            <input type="number" name="pregnancies" onChange={onChange} placeholder="Number of Pregnancies" />
            <input type="number" name="pregnancies" onChange={onChange} placeholder="Number of Pregnancies" />
            <input type="number" name="pregnancies" onChange={onChange} placeholder="Number of Pregnancies" />
            <input type="number" name="pregnancies" onChange={onChange} placeholder="Number of Pregnancies" />
            <input type="number" name="pregnancies" onChange={onChange} placeholder="Number of Pregnancies" />
            <input type="number" name="pregnancies" onChange={onChange} placeholder="Number of Pregnancies" />
            <input type="number" name="pregnancies" onChange={onChange} placeholder="Number of Pregnancies" />
            {/* <input type="text" name="name" onChange={onChange} placeholder="Name (e.g. John)" />
            <input type="email" name="email" onChange={onChange} placeholder="Email (e.g. john.doe@example.com)" /> */}
            <button type="submit">Submit Form</button>
        </form>
    );
}

export default Form;
