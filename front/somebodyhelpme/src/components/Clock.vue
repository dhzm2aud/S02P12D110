<template>
  <div id="clock" class="w3-center">
    <p class="date ">{{ date}}</p>
    <p class="time ">{{ time }}</p>
  </div>
</template>

<script>
export default {
  name: "clock",
  data: () => {
    return {
      week: ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"],
      time: "",
      date: "",
      timerID: ""
    };
  },
  methods: {
    onload() {
      this.timerID = setInterval(this.updateTime, 1000);
      this.updateTime();
    },
    updateTime() {
      var cd = new Date();
      this.time =
        this.zeroPadding(cd.getHours(), 2) +
        ":" +
        this.zeroPadding(cd.getMinutes(), 2) +
        ":" +
        this.zeroPadding(cd.getSeconds(), 2);
      this.date =
        this.zeroPadding(cd.getFullYear(), 4) +
        "-" +
        this.zeroPadding(cd.getMonth() + 1, 2) +
        "-" +
        this.zeroPadding(cd.getDate(), 2) +
        " " +
        this.week[cd.getDay()];
    },
    zeroPadding(num, digit) {
      var zero = "";
      for (var i = 0; i < digit; i++) {
        zero += "0";
      }
      return (zero + num).slice(-digit);
    }
  },
  mounted() {
      this.onload();
  }
};
</script>

<style>
#clock {
  color: #329ec2;
  text-shadow: 0 0 20px rgba(10, 175, 230, 1), 0 0 20px rgba(10, 175, 230, 0);
  
}
</style>