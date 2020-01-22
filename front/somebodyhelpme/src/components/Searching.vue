<template>
  <div class="w3-display-container">
    <form class="w3-panel w3-padding-64 w3-round-xlarge" action="#">
      <div class="d-flex p-5">
        <div class="w3-dropdown-hover">
          <button class="w3-button">옵션</button>
          <div class="w3-dropdown-content w3-bar-block w3-card-4">
            <a href="#" class="w3-bar-item w3-button">Link 1</a>
            <a href="#" class="w3-bar-item w3-button">Link 2</a>
            <a href="#" class="w3-bar-item w3-button">Link 3</a>
          </div>
        </div>
        <input class="w3-input w3-border p-2" type="text" placeholder="Search.." name="search" />
        <button class="w3-button w3-white w3-border w3-blue p-2"><i class="fa fa-search"></i></button>
      </div>
    </form>
  </div>
</template>

<script>
export default {
  name: "Searching",
  props: {
    msg: String
  }
};
</script>
