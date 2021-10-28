import mongoose from "mongoose";
import("./User.js");


mongoose.connect(
  process.env.MONGODB_URL || "mongodb://mongo:27017/userMS",
  { useNewUrlParser: true },
  (err) => {
    if (!err) {
      console.log("MongoBD success!");
    } else {
      console.log("error : " + err);
    }
  }
);
export default mongoose;
