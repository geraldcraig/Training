import React from "react";
import '../App.css';
import "bootstrap/dist/css/bootstrap.min.css";

const Products = () => {
    return (
        <body>

        <nav class="navbar navbar-expand-sm navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="index.html">The Record Store</a>

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                    aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

        </nav>

        <header class="jumbotron jumbotron-fluid text-center mt-5">
            <div class="container">
                <h1 class="display-1">Products</h1>
                <p class="lead">Welcome to The Record Store. We have a large collection of new and used CDs and
                    Vinyl.</p>
            </div>
        </header>

        <main>

            <div class="container">
                <div class="table-responsive">
                    <table class="table table-sm table-striped table-hover">
                        <thead class="thead-dark">
                        <tr>
                            <th>Artist</th>
                            <th>Title</th>
                            <th>Format</th>
                            <th>Price</th>
                            <th>Image</th>
                            <th>Check Availability</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>Miles Davis</td>
                            <td>Kind of Blue</td>
                            <td>Vinyl</td>
                            <td>£29.99</td>
                            <td><img src="../images/blue.jpeg" style="width: 20%;"/></td>

                            <td>
                                {/*<div onmouseover="mOver2(this)" onmouseout="mOut(this)">Check Availability</div>*/}
                            </td>
                        </tr>
                        <tr>
                            <td>John Coltrane</td>
                            <td>A love Supreme</td>
                            <td>Vinyl</td>
                            <td>£24.99</td>
                            <td><img src="../images/supreme.jpeg" style="width: 20%;"/></td>
                            <td>
                                {/*<div onmouseover="mOver1(this)" onmouseout="mOut(this)">Check Availability</div>*/}
                            </td>
                        </tr>
                        <tr>
                            <td>Charles Mingus</td>
                            <td>Mingus Ah Um</td>
                            <td>Vinyl</td>
                            <td>£27.99</td>
                            <td><img src="../images/mingus.jpeg" style="width: 20%;"/></td>
                            <td>
                                {/*<div onmouseover="mOver6(this)" onmouseout="mOut(this)">Check Availability</div>*/}
                            </td>
                        </tr>
                        <tr>
                            <td>Ornette Coleman</td>
                            <td>The Shape of Jazz to Come</td>
                            <td>Vinyl</td>
                            <td>£21.99</td>
                            <td><img src="../images/ornette.jpeg" style="width: 20%;"/></td>
                            <td>
                                {/*<div onmouseover="mOver3(this)" onmouseout="mOut(this)">Check Availability</div>*/}
                            </td>
                        </tr>
                        <tr>
                            <td>Sonny Rollins</td>
                            <td>Saxophone Colossus</td>
                            <td>Vinyl</td>
                            <td>£22.99</td>
                            <td><img src="../images/rollins.jpeg" style="width: 20%;"/></td>
                            <td>
                                {/*<div onmouseover="mOver5(this)" onmouseout="mOut(this)">Check Availability</div>*/}
                            </td>
                        </tr>
                        <tr>
                            <td>Dave Bruebeck</td>
                            <td>Time Out</td>
                            <td>Vinyl</td>
                            <td>£26.99</td>
                            <td><img src="../images/brubeck.jpeg" style="width: 20%;"/></td>
                            <td>
                                {/*<div onmouseover="mOver4(this)" onmouseout="mOut(this)">Check Availability</div>*/}
                            </td>
                        </tr>

                        {/*<script>*/}
                        {/*    function mOver1(obj) {*/}
                        {/*    obj.innerHTML = "out of stock"*/}
                        {/*}*/}

                        {/*    function mOver2(obj) {*/}
                        {/*    obj.innerHTML = "10 in stock"*/}
                        {/*}*/}

                        {/*    function mOver3(obj) {*/}
                        {/*    obj.innerHTML = "9 in stock"*/}
                        {/*}*/}

                        {/*    function mOver4(obj) {*/}
                        {/*    obj.innerHTML = "8 in stock"*/}
                        {/*}*/}

                        {/*    function mOver5(obj) {*/}
                        {/*    obj.innerHTML = "7 in stock"*/}
                        {/*}*/}

                        {/*    function mOver6(obj) {*/}
                        {/*    obj.innerHTML = "6 in stock"*/}
                        {/*}*/}

                        {/*    function mOut(obj) {*/}
                        {/*    obj.innerHTML = "Check Availability"*/}
                        {/*}*/}
                        {/*</script>*/}
                        </tbody>
                    </table>
                </div>
            </div>

            {/*    $(document).ready(function () {*/}
            {/*    $("#flip").click(function () {*/}
            {/*        $("#panel").slideToggle("slow");*/}
            {/*    });*/}
            {/*});*/}

            {/*    const item1 = {*/}
            {/*    "name": "Art Blakey and the Jazz Messengers",*/}
            {/*    "title": "Moanin'",*/}
            {/*    "format": "CD",*/}
            {/*    "price": "£3.99",*/}
            {/*};*/}

            {/*    const item2 = {*/}
            {/*    name: "Billie Holiday",*/}
            {/*    title: "Lady In Satin",*/}
            {/*    format: "Vinyl",*/}
            {/*    price: "£13.99"*/}
            {/*};*/}

            {/*    const item3 = {*/}
            {/*    name: "Stan Getz and Joao Gilberto",*/}
            {/*    title: "Getz/Gilberto",*/}
            {/*    format: "CD",*/}
            {/*    price: "£6.99"*/}
            {/*};*/}

            {/*    const item4 = {*/}
            {/*    name: "Thelonious Monk",*/}
            {/*    title: "Genius of Modern Music: Volume 1",*/}
            {/*    format: "CD",*/}
            {/*    price: "£6.99"*/}
            {/*};*/}

            {/*</script>*/}

            <div id="flip">Click Here for This Weeks Special Offers</div>
            <div id="panel">
                <p id="demo1"></p>
                <p id="demo2"></p>
                <p id="demo3"></p>
                <p id="demo4"></p>
                {/*<script>*/}
                {/*    document.getElementById("demo1").innerHTML = item1.name + " - " + item1.title + " - " + item1.format*/}
                {/*    + " - " + item1.price;*/}
                {/*    document.getElementById("demo2").innerHTML = item2.name + " - " + item2.title + " - " + item2.format*/}
                {/*    + " - " + item2.price;*/}
                {/*    document.getElementById("demo3").innerHTML = item3.name + " - " + item3.title + " - " + item3.format*/}
                {/*    + " - " + item3.price;*/}
                {/*    document.getElementById("demo4").innerHTML = item4.name + " - " + item4.title + " - " + item4.format*/}
                {/*    + " - " + item4.price;*/}
                {/*</script>*/}
            </div>

        </main>

        {/*<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"*/}
        {/*        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"*/}
        {/*        crossorigin="anonymous"></script>*/}
        {/*<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"*/}
        {/*        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"*/}
        {/*        crossorigin="anonymous"></script>*/}
        {/*<script src="../scripts/script.js"></script>*/}
        </body>
    );
};

export default Products;