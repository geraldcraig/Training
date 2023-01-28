/**
 * Create a class for the Backpack object type.
 * @link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Classes
 */
import Backpack from "./Backpack.js";

const everydayPack = new Backpack(
    "Everyday Backpack",
    30,
    "grey",
    15,
    26,
    26,
    false,
    ""
);

const content = `
    <main>
        <article>
            <h1>${everydayPack.name}</h1>
            <ul>
                <li>Volume:</li>
                <li>Colour:</li>
                <li>Age:</li>
                <li>Number of pockets:</li>
                <li>Left strap length:</li>
                <li>Right strap length:</li>
                <li>Lid status:</li>         
            </ul>
        </article>
    </main>
`;

document.body.innerText= content;



console.log("The everydayPack object:", everydayPack);
console.log("The pocketNum value:", everydayPack.pocketNum);
// console.log("The straplength left is:", backpack.strapLength.left);
// console.log("The straplength right is:", backpack["strapLength"].right);
// console.log("The straplength right is:", backpack[query2].right);
// console.log("The colour is:", backpack[query]);
