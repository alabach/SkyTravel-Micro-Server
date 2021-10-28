import express from "express";
import dotenv from "dotenv";
import userRoute from "./userRoute.js";
import("./mongo.js");
import registerWithEureka from "./eureka-helper.js";

//config
dotenv.config();
const app = express();

//middleware
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// routing
app.use("/users", userRoute);

//port-config
const port = process.env.PORT;
app.get("/", (req, res) =>
  res.send("I am user-service on port : " + `${port}`)
);
app.listen(port, () =>
  console.log(`server is listening at http://localhost:${port}`)
);

registerWithEureka("user-service", port);
