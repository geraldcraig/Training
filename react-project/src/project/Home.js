import records1 from "../images/records1.jpg";
import records6 from "../images/records6.jpg";
import records3 from "../images/records3.jpg";

const Home = () => {
    return <body>

    <link
        rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
        crossOrigin="anonymous"
    />

    <header class="jumbotron jumbotron-fluid text-center mt-5">
        <div class="container">
            <h1 class="display-1">The Record Store</h1>
            <p class="lead">Welcome to The Record Store. We have a large collection of new and used CDs and Vinyl.</p>
        </div>
    </header>

    <main class="container-fluid mt-5">

        <div class="row">

            <div class="col-sm-4">
                <figure>
                    <a href="products.html"><img class="zoom" src={records1} alt="records"
                                                 class="img-fluid>"/></a>
                </figure>
                <h1>Vinyl</h1>
                <p class="lead">Large collection of new and used Vinyl.</p>
            </div>

            <div class="col-sm-4">
                <figure>
                    <a href="products.html"><img class="zoom" src={records6} alt="records"
                                                 class="img-fluid>"/></a>
                </figure>
                <h1>CD</h1>
                <p class="lead">Large collection of new and used CDs.</p>
            </div>

            <div class="col-sm-4">
                <figure>
                    <a href="products.html"><img class="zoom" src={records3} alt="records"
                                                 class="img-fluid>"/></a>
                </figure>
                <h1>Equipment</h1>
                <p class="lead">Large collection of new and used Equipment.</p>
            </div>

        </div>

        {/*<script>*/}
        {/*    var w = null; // initialize variable*/}

        {/*    // function to start the timer*/}
        {/*    function startTimer() {*/}
        {/*    // First check whether Web Workers are supported*/}
        {/*    if (typeof (Worker) !== "undefined") {*/}
        {/*    // Check whether Web Worker has been created. If not, create a new Web Worker based on the Javascript file simple-timer.js*/}
        {/*    if (w == null) {*/}
        {/*    w = new Worker("scripts/timer.js");*/}
        {/*}*/}
        {/*    // Update timer div with output from Web Worker*/}
        {/*    w.onmessage = function (event) {*/}
        {/*    document.getElementById("timer").innerHTML = event.data;*/}
        {/*};*/}
        {/*} else {*/}
        {/*    // Web workers are not supported by your browser*/}
        {/*    document.getElementById("timer").innerHTML = "Sorry, your browser does not support Web Workers ...";*/}
        {/*}*/}
        {/*}*/}

        {/*    // function to stop the timer*/}
        {/*    function stopTimer() {*/}
        {/*    w.terminate();*/}
        {/*    timerStart = true;*/}
        {/*    w = null;*/}
        {/*}*/}
        {/*</script>*/}

        {/*<div class="clock">*/}
        {/*    <h2>Website Timer</h2>*/}
        {/*    <div class="header">A simple timer(in seconds):</div>*/}

        {/*    <div class="timer" id="timer">00:00</div>*/}
        {/*    <div class="buttons">*/}
        {/*        <button onclick="startTimer()" id="button1" class="btn btn-primary" value="Submit">Start Timer</button>*/}
        {/*        <button onclick="stopTimer()" id="button2" class="btn btn-primary" value="Submit">Stop Timer</button>*/}
        {/*    </div>*/}
        {/*</div>*/}
        <br/>

    </main>

    <footer class="jumbotron-fluid text-center bg-dark p-5">

        <div class="container text-white">
            <p>&copy; Copyright 2022</p>
            <p><a href="mailto:themusic@shop.net" class="text-white">themusic@shop.net</a></p>
        </div>

    </footer>

    {/*<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"*/}
    {/*        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"*/}
    {/*        crossorigin="anonymous"></script>*/}
    {/*<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"*/}
    {/*        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"*/}
    {/*        crossorigin="anonymous"></script>*/}
    {/*<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"*/}
    {/*        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"*/}
    {/*        crossorigin="anonymous"></script>*/}
    {/*<script src="scripts/script.js"></script>*/}

    <script src="https://cdn.jsdelivr.net/npm/react/umd/react.production.min.js" crossOrigin></script>

    <script
        src="https://cdn.jsdelivr.net/npm/react-dom/umd/react-dom.production.min.js"
        crossOrigin></script>

    <script
        src="https://cdn.jsdelivr.net/npm/react-bootstrap@next/dist/react-bootstrap.min.js"
        crossOrigin></script>

    <script>var Alert = ReactBootstrap.Alert;</script>
    </body>;
};

export default Home;