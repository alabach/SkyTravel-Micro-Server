import express from "express";
import User from "./User.js";
import mongoose from "mongoose";

const router = express.Router();

// users get
router.get("/all", async (req, res) => {
  try {
    const users = await User.find();

    res.status(200).json(users);
  } catch (error) {
    res.status(404).send({ message: error.message });
  }
});

//user registration
router.post("/adduser", async (req, res, next) => {
  try {
    const data = req.body;

    const user = new User({
      firstName: data.firstName,
      lastName: data.lastName,
      birthDate: data.birthDate,
      identityCard: data.identityCard,
      phoneNumber: data.phoneNumber,
      isAdmin: data.isAdmin,
    });
    await user.save();
    res.status(201).end();
  } catch (err) {
    next(err);
  }
});

//user update
router.put("/edituser/:id", async (req, res, next) => {
  try {
    const user = await User.findById(req.params.id);
    const data = req.body;
    user.firstName = data.firstName ? data.firstName : user.firstName;
    user.lastName = data.lastName ? data.lastName : user.lastName;
    user.birthDate = data.birthDate;
    user.identityCard = data.identityCard;
    user.phoneNumber = data.phoneNumber ? data.phoneNumber : user.phoneNumber;
    user.isAdmin = data.isAdmin ? data.isAdmin : user.isAdmin;

    const updatedUser = await user.save();
    res.send(updatedUser);
  } catch (err) {
    next(err);
  }
});

// user delete

router.delete("/:id", (req, res) => {
  User.findByIdAndRemove(req.params.id, (err, doc) => {
    if (!err) {
      res.send(doc);
    } else {
      console.log("Error in User Delete :" + JSON.stringify(err, undefined, 2));
    }
  });
});

router.get("/:name", async (req, res) => {
  res.send("hello " + req.params.name);
});

//Seed-Method
router.post("/seed", async (req, res) => {
  const user1 = new User({
    firstName: "feres",
    lastName: "mechemech",
    birthDate: "1996-10-27",
    identityCard: "66666666",
    phoneNumber: "24319797",
    isAdmin: true,
  });

  const user2 = new User({
    firstName: "radhouan",
    lastName: "khouadja",
    birthDate: "1990-10-27",
    identityCard: "09741887",
    phoneNumber: "55231990",
    isAdmin: true,
  });

  try {
    const addedUser1 = await user1.save();
    const addedUser2 = await user2.save();

    res.status(201).json("added all users");
  } catch (error) {
    res.status(404).send({ message: error.message });
  }
});

export default router;
