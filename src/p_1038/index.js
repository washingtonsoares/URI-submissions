input = "2 3"

const code = input.split(" ")[0]
const quantidade = input.split(" ")[1]

const snacks = {
  1: { price: 4.00 },
  2: { price: 4.50 },
  3: { price: 5.00 },
  4: { price: 2.00 },
  1: { price: 1.50 }
}

const formatValue = value => parseFloat(Math.round(value * 100) / 100).toFixed(2)

const totalPrice = snacks[code].price * quantidade

console.log(`Total: R$ ${formatValue(totalPrice)}`)
