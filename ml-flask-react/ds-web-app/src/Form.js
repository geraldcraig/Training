import { useState } from "react";
import './Form.css';

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

    const [loading, setLoading] = useState(false);
    const [result, setResult] = useState("");

    const handleSubmit = (event) => {
        event.preventDefault();

        console.log("Form submitted");
        console.log(form);

        const form_data = new FormData();
        form_data.append('1', form.pregnancies);
        form_data.append('2', form.glucose);
        form_data.append('3', form.blood_pressure);
        form_data.append('4', form.skin_thickness);
        form_data.append('5', form.insulin_level);
        form_data.append('6', form.bmi);
        form_data.append('7', form.diabetes_pedigree);
        form_data.append('8', form.age);

        setLoading(true);
        
        fetch('http://127.0.0.1:5000/predict', {
            method: 'POST',
            body: form_data
        })
        .then(response => response.text())
        .then(html => {
            setResult(html);
            setLoading(false);
        })
    };

        console.log("Form submitted");
        console.log(form);
    

    const onChange = (event) => {
        console.log("Changed input field");
        const name = event.target.name;
        const value = event.target.value;
        setForm({ ...form, [name]: value });
    }

    const handleClear = () => {
        setForm({
            pregnancies: "",
            glucose: "",
            blood_pressure: "",
            skin_thickness: "",
            insulin_level: "",
            bmi: "",
            diabetes_pedigree: "",
            age: ""
        });

        setResult("");
    }

    return (
        <form onSubmit={handleSubmit}>
            <h4>Diabetes Prediction Model</h4>
            <p>Example to Predict Probability of Diabetes</p>
            <input type="number" name="pregnancies" value={form.pregnancies} onChange={onChange} placeholder="Number of Pregnancies" required />
            <input type="number" name="glucose" value={form.glucose} onChange={onChange} placeholder="Glucose" required />
            <input type="number" name="blood_pressure" value={form.blood_pressure} onChange={onChange} placeholder="Blood" required />
            <input type="number" name="skin_thickness" value={form.skin_thickness} onChange={onChange} placeholder="Skin" required />
            <input type="number" name="insulin_level" value={form.insulin_level} onChange={onChange} placeholder="Insulin" required />
            <input type="number" name="bmi" value={form.bmi} onChange={onChange} placeholder="BMI" required />
            <input type="number" name="diabetes_pedigree" value={form.diabetes_pedigree} onChange={onChange} placeholder="Diabetes" required />
            <input type="number" name="age" value={form.age} onChange={onChange} placeholder="Age" required />
            <button type="submit" disabled={loading}>{loading ? "Predicting Result..." : "Submit Form"}</button>
            {result && <span onClick={handleClear}>Clear Prediction</span>}

            {result && <div dangerouslySetInnerHTML={{__html: result}} className="result" />}
        </form>
    );
}

export default Form;
