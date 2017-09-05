const input = 140153

const hours = parseInt(input / 3600)
const minutes = parseInt((input % 3600) / 60)
const seconds = parseInt((input % 3600) % 60)

console.log(`${hours}:${minutes}:${seconds}`)
