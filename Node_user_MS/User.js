import mongoose from "mongoose";

const userSchema = mongoose.Schema({
  firstName: { type: String, required: true },
  lastName: { type: String, required: true },
  birthDate: { type: String, required: true },
  identityCard: {
    type: String,
    required: true,
    minlength: 8,
    maxlength: 8,
  },
  phoneNumber: {
    type: String,
    required: true,
    minlength: 8,
    maxlength: 8,
  },
  isAdmin: { type: Boolean, required: true },
});

const User = mongoose.model("User", userSchema);

export default User;
