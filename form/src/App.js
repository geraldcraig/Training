import {Route, Routes} from "react-router-dom";
import Layout from "./Component/Layout";
import Home from "./Component/Home";

function App() {
    return (
            <Routes>
                <Route element={<Layout />}>
                    <Route index element={<Home />} />
                </Route>
            </Routes>
    );
}

export default App;