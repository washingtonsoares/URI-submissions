const input = 400

const years = parseInt(input/365)

const months = parseInt((input % 365) / 30)

const days = (input % 365) % 30

console.log(`${years} ano(s)`)
console.log(`${months} mes(es)`)
console.log(`${days} dia(s)`)
